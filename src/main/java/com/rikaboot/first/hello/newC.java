package com.rikaboot.first.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class newC {public class TestController {

    // @RestController
    public class  test {
        @RequestMapping(value = "/test",method = RequestMethod.GET)

        public String helloData(){

            String data1="{\n" +
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
                    "\t\t}]}";


            //String[] data = {data1,data2,data3,data4,data5,data2,data3,data4,data2,data1};

            //int rand = (int)(1+Math.random()*9)-1;
            return data1;
            //System.out.println(data[rand]);
        }
    }
}

}
