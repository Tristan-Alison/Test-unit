package fr.m2i.exemple.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;

/**
 * Initialise JavaServer Faces applications.
 *
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3) //l'ajout d'une version permet de forcer l'utilisation de JSF 2.3
@ApplicationScoped
public class FacesApplicationConfig {

}
