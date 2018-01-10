import { TescoRecipePage } from './app.po';

describe('tesco-recipe App', () => {
  let page: TescoRecipePage;

  beforeEach(() => {
    page = new TescoRecipePage();
  });

  it('should display welcome message', done => {
    page.navigateTo();
    page.getParagraphText()
      .then(msg => expect(msg).toEqual('Welcome to app!!'))
      .then(done, done.fail);
  });
});
