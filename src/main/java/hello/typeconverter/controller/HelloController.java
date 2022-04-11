package hello.typeconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {
    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request, HttpServletResponse response){

        String data = request.getParameter("data"); //문자타입조회
        Integer intValue = Integer.valueOf(data);
        System.out.println("intValue = " + intValue);
        return "OK";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data){
        System.out.println("int = " + data);
        return "OK";
    }
}
