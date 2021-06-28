package com.makotojava.learn.hellospringboot;

        import org.springframework.web.bind.annotation.CrossOrigin;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;
        @CrossOrigin(origins = "*")
        @RestController
        public class HelloRestController {
      
          @RequestMapping("/hola")
          public String hello() {
            return "¡Ves, se a cambiado el texto!";
          }
        }