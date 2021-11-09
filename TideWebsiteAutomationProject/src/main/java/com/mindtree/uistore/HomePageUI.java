package com.mindtree.uistore;

import org.openqa.selenium.By;

public class HomePageUI {
	public By shop_products = By.linkText("Shop Products");
	public By powder = By.xpath("(//span[@itemprop='name'])[3]");
	public By text = By.xpath("(//strong)[3]");
	public By SearchBar = By.xpath("(//input[@placeholder='Search'])[1]");
	public By findicon = By.xpath("(//button[@type='submit'])[1]");
	public By text1 = By.xpath("(//strong)[1]");
	public By wash_clothes = By.linkText("How to Wash Clothes");
	public By learnmore = By.xpath("(//a[@data-action-detail='Learn More'])[2]");
	public By text2 = By.xpath("//a[@href='/en-us/how-to-wash-clothes/how-to-do-laundry/how-to-read-laundry-symbols'] //p");
}
