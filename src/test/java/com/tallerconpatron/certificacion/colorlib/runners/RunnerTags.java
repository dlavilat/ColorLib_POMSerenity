package com.tallerconpatron.certificacion.colorlib.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/",
        tags = "@HistoriaDeUsuario",
        glue ="com.tallerconpatron.certificacion.colorlib.definition",
        snippets = CucumberOptions.SnippetType.CAMELCASE )
public class RunnerTags {
}
