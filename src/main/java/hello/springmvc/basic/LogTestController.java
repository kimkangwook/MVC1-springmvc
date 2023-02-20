package hello.springmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

            log.trace(" trace my log="+ name); // logging level을 debug로 설정해두면 우선 문자열 더하기 하면서 연산을 사용하고 쓸데없이 리소스 사용

        log.trace("trace log={}",name); // logging level을 debug로 설정해두면 log.trace가 호출되긴 하지만 아무런 연산없이 무효화됨
        log.debug("debug log={}",name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);

        return "ok";
    }
}
