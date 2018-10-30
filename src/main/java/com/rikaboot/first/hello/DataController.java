package com.rikaboot.first.hello;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;

@RestController
public class DataController {

 /**   public class device {


        private  String deviceId;
        private String deviceName;
        private String voltage;
        private String current;

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getVoltage() {
            return voltage;
        }

        public void setVoltage(String voltage) {
            this.voltage = voltage;
        }

        public String getCurrent() {
            return current;
        }

        public void setCurrent(String current) {
            this.current = current;
        }

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getStateCode() {
            return stateCode;
        }

        public void setStateCode(String stateCode) {
            this.stateCode = stateCode;
        }

        private String temp;
        private String date;
        private String stateCode;

    }



   public class data {

        private device[] device;

        public device[] getDeviceData() {
            return device;
        }

        public void setDeviceData(device[] device) {
            this.device = device;
        }
    }**/




    @RequestMapping(value = "/device",method = RequestMethod.GET)


    public String dev(){


        String deviceData = "{\n" +
                "\t\"deviceData\": [{\n" +
                "\t\t\t\"deviceId\": \"#1001\",\n" +
                "\t\t\t\"deviceName\": \"device1\",\n" +
                "\t\t\t\"voltage\": \"220.5\",\n" +
                "\t\t\t\"current\": \"33.0\",\n" +
                "\t\t\t\"temp\": \"22.1\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1002\",\n" +
                "\t\t\t\"deviceName\": \"device2\",\n" +
                "\t\t\t\"voltage\": \"239.99\",\n" +
                "\t\t\t\"current\": \"33.4\",\n" +
                "\t\t\t\"temp\": \"22.2\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1001\",\n" +
                "\t\t\t\"deviceName\": \"device1\",\n" +
                "\t\t\t\"voltage\": \"220.5\",\n" +
                "\t\t\t\"current\": \"33.0\",\n" +
                "\t\t\t\"temp\": \"22.3\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1001\",\n" +
                "\t\t\t\"deviceName\": \"device1\",\n" +
                "\t\t\t\"voltage\": \"220.5\",\n" +
                "\t\t\t\"current\": \"33.87\",\n" +
                "\t\t\t\"temp\": \"22.4\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"002\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1002\",\n" +
                "\t\t\t\"deviceName\": \"device2\",\n" +
                "\t\t\t\"voltage\": \"220.5\",\n" +
                "\t\t\t\"current\": \"33.99\",\n" +
                "\t\t\t\"temp\": \"22.5\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1001\",\n" +
                "\t\t\t\"deviceName\": \"device1\",\n" +
                "\t\t\t\"voltage\": \"220.5\",\n" +
                "\t\t\t\"current\": \"31.00\",\n" +
                "\t\t\t\"temp\": \"22.6\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1002\",\n" +
                "\t\t\t\"deviceName\": \"device2\",\n" +
                "\t\t\t\"voltage\": \"220.5234\",\n" +
                "\t\t\t\"current\": \"330\",\n" +
                "\t\t\t\"temp\": \"22.7\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1001\",\n" +
                "\t\t\t\"deviceName\": \"device1\",\n" +
                "\t\t\t\"voltage\": \"230.5\",\n" +
                "\t\t\t\"current\": \"330\",\n" +
                "\t\t\t\"temp\": \"22.8\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1003\",\n" +
                "\t\t\t\"deviceName\": \"device3\",\n" +
                "\t\t\t\"voltage\": \"220.78\",\n" +
                "\t\t\t\"current\": \"32.78\",\n" +
                "\t\t\t\"temp\": \"22.9\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1001\",\n" +
                "\t\t\t\"deviceName\": \"device1\",\n" +
                "\t\t\t\"voltage\": \"220.5\",\n" +
                "\t\t\t\"current\": \"43.2\",\n" +
                "\t\t\t\"temp\": \"21.5\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1001\",\n" +
                "\t\t\t\"deviceName\": \"device1\",\n" +
                "\t\t\t\"voltage\": \"920.3\",\n" +
                "\t\t\t\"current\": \"22.0\",\n" +
                "\t\t\t\"temp\": \"20.5\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1004\",\n" +
                "\t\t\t\"deviceName\": \"device4\",\n" +
                "\t\t\t\"voltage\": \"220.5\",\n" +
                "\t\t\t\"current\": \"30.9\",\n" +
                "\t\t\t\"temp\": \"23.5\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1001\",\n" +
                "\t\t\t\"deviceName\": \"device1\",\n" +
                "\t\t\t\"voltage\": \"880.5\",\n" +
                "\t\t\t\"current\": \"32.4\",\n" +
                "\t\t\t\"temp\": \"24.5\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"003\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1002\",\n" +
                "\t\t\t\"deviceName\": \"device2\",\n" +
                "\t\t\t\"voltage\": \"220.24\",\n" +
                "\t\t\t\"current\": \"44.23\",\n" +
                "\t\t\t\"temp\": \"25.5\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"deviceId\": \"#1001\",\n" +
                "\t\t\t\"deviceName\": \"device1\",\n" +
                "\t\t\t\"voltage\": \"220.5\",\n" +
                "\t\t\t\"current\": \"34.56\",\n" +
                "\t\t\t\"temp\": \"26.5\",\n" +
                "\t\t\t\"date\": \"2018.10.23\",\n" +
                "\t\t\t\"stateCode\": \"001\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";


        //JsonObject jsonObject = (JsonObject) new JsonParser().parse(deviceData);




      //  data data = new Gson().fromJson(deviceData, data.class);
       // String str = data.getDeviceData()[0].getDeviceName();









      //System.out.println(str);

        return deviceData;
    }


}
