package com.tallerconpatron.certificacion.colorlib.step.form;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaForm;
import net.thucydides.core.annotations.Step;


public class TaskFormValidation extends BasePage {

    public PaginaForm paginaForm;

    @Step
    public void verifyTitlePage(){
        paginaForm.verifySingIn();
    }

    @Step

    /*public void setData(String strRequired,String strSelect,
    String strSelectMultiple, String strUrl,
    String strEmail, String strPassword,
    String strConfirmPassword){*/
    public void setData(io.cucumber.datatable.DataTable dataTable){
        setRequired(dataTable.cell(1,0));
        setSelect(dataTable.cell(1,1));
        setSelectMultiple(dataTable.cell(1,2));
        setUrl(dataTable.cell(1,3));
        setEmail(dataTable.cell(1,4));
        setPassword(dataTable.cell(1,5));
        setConfirmPassword(dataTable.cell(1,6));
        setMinField(dataTable.cell(1,7));
        setMaxField(dataTable.cell(1,8));
    }
    public void setRequired(String strRequired){
        paginaForm.txt_required.sendKeys(strRequired);
    }
    public void setSelect(String strSelect){
        paginaForm.select_sport.selectByValue(strSelect);
    }
    public void setSelectMultiple(String strSelectMultiple){
        paginaForm.select_multiple.selectByValue(strSelectMultiple);
    }
    public void setUrl(String strUrl){
        paginaForm.txt_url.sendKeys(strUrl);
    }
    public void setEmail(String strEmail){
        paginaForm.txt_email.sendKeys(strEmail);
    }
    public void setPassword(String strPassword){
        paginaForm.txt_password.sendKeys(strPassword);
    }
    public void setConfirmPassword(String strConfirmPassword){
        paginaForm.txt_confirmPassword.sendKeys(strConfirmPassword);
    }
    public void setMinField(String MinField){
        paginaForm.txt_minimumField.sendKeys(MinField);
    }
    public void setMaxField(String MaxField){
        paginaForm.txt_maximumField.sendKeys(MaxField);
    }
}
