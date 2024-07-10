package dataConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import commons.BasePage;
import commons.GlobalConstants;

import java.io.File;

public class CustomerInfoData {
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("idNumber")
    private String idNumber;
    @JsonProperty("accountNumber")
    private String accountNumber;


    public static CustomerInfoData getCustomerInfoData(String fileName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(new File(GlobalConstants.DATA_TEST_PATH + fileName), CustomerInfoData.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


}