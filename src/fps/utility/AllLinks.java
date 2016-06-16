package fps.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Init.Initiate("firefox");
		List<WebElement> linkElements = Init.driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		
		
		for(int i = 0;i<linkElements.size();i++){
			
			
			WebElement ele= linkElements.get(i);
			linkTexts[i] =ele.getText();
			//System.out.println(linkTexts[i]);
		}
		
		for( int t = 0; t<linkTexts.length;t++){
			
			Init.driver.findElement(By.linkText(linkTexts[t])).click();
			String url = Init.driver.getCurrentUrl();
			System.out.println(url);
			Init.driver.navigate().back();
		}
	}

}
