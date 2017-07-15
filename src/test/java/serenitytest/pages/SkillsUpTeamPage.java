package serenitytest.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://skillsup.ua/")
public class SkillsUpTeamPage extends PageObject {

        private By linkourteam = By.linkText("Наша команда");
        private By memberclass = By.className("name");

        public void goToCoachPage(){
            WebElement goToCoachPage = find(linkourteam);
            goToCoachPage.click();
        }

        public List<String> findCoachNames () {
            List<WebElementFacade> listMembers = findAll(memberclass);
            List<String> names = new ArrayList<String>();
            for (WebElementFacade i: listMembers){
                names.add (i.getText());
            }
            return names;
        }


}
