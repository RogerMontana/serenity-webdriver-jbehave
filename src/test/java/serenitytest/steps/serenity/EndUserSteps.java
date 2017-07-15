package serenitytest.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.SkillsUpTeamPage;
import serenitytest.pages.WikiDummyPage;

public class EndUserSteps extends ScenarioSteps {

    private WikiDummyPage wikiDummyPage;
    SkillsUpTeamPage skillsUpTeamPage;

    @Step
    public void enters(String keyword) {
        wikiDummyPage.enterKeywords(keyword);
    }

    @Step
    public void starts_search() {
        wikiDummyPage.lookupTerms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(wikiDummyPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        wikiDummyPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

    @Step
    public void go_to_(String term) {
        enters(term);
        starts_search();
    }
}