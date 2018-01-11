package uk.ac.brunel.tescohackathonrecipe.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import uk.ac.brunel.tescohackathonrecipe.domain.SpecificIngredient;
import uk.ac.brunel.tescohackathonrecipe.domain.SpecificIngredientList;
import uk.ac.brunel.tescohackathonrecipe.service.IngredientService;

import javax.swing.text.html.parser.Entity;
import java.net.URI;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 */
@Service
public class IngredientServiceImpl implements IngredientService {

    /**
     * DO NOT COMMIT YOUR API KEY PLEASE !!!!
     */
    public static final String API_KEY = ResourceBundle.getBundle("tesco-api-key").getString("key-value");

    @Override
    public List<SpecificIngredient> getIngredientsFromTescoDatabase(String ingredientName) {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        SpecificIngredientList specificIngredients = new SpecificIngredientList();

        try
        {
            URIBuilder builder = new URIBuilder("https://dev.tescolabs.com/grocery/products/");
            builder.setParameter("query", ingredientName);

            URI uri = builder.build();
            HttpGet request = new HttpGet(uri);
            request.setHeader("Ocp-Apim-Subscription-Key", API_KEY);


            HttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();


            ObjectMapper mapper = new ObjectMapper();

            if (entity != null) {
                JSONObject jsonObject = new JSONObject(entity);
                specificIngredients =  new Gson().fromJson(jsonObject.toString(), SpecificIngredientList.class);
                System.out.println(specificIngredients.getSpecificIngredients().toString());
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return specificIngredients.getSpecificIngredients();
    }
}
