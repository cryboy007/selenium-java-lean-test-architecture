package com.eliasnogueira.test;

import com.eliasnogueira.BaseWeb;
import com.eliasnogueira.page.v2ex.HomePage;
import org.testng.annotations.Test;

/**
 * @ClassName V2exWebTest
 * @Author tao.he
 * @email study.hetao@foxmail.com
 * @Since 2024/12/5 15:43
 */
public class V2exWebTest extends BaseWeb {
    @Test(description = "v2ex home ")
    public void visitV2ex() {
        final HomePage homePage = new HomePage();
        homePage.clickHome();
        homePage.clickPlay();
        homePage.clickTab();
        homePage.clickTech();
    }
}
