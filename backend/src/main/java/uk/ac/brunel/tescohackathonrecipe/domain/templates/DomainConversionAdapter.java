package uk.ac.brunel.tescohackathonrecipe.domain.templates;

/**
 * Conversion interface.
 */
public interface DomainConversionAdapter<T> {

    T toParentDomain();
}
