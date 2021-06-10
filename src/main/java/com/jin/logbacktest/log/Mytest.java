package com.jin.logbacktest.log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mytest {
    private final Logger logger = LoggerFactory.getLogger(Mytest.class);
    private Stu stu;
    @GetMapping("/test")
    public int getId(){
        return get();
    }

    private int get () {
      try {
          return stu.getId();
      }catch (Exception e){
          logger.error("stu是空");
          throw new RuntimeException();
      }finally {
          return 1;
      }
    }
    @GetMapping("test1")
    public void test1(){
        System.out.println(1/0);
    }

}
