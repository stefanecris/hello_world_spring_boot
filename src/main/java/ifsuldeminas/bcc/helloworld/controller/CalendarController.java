package ifsuldeminas.bcc.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
@RequestMapping("/calendar") // Todos os métodos dessa classe tratam requisições do tipo /calendar/algumaCoisa
public class CalendarController {

    @GetMapping("yesterday")
    public String yesterday() {
        GregorianCalendar yesterday = new GregorianCalendar();
        yesterday.roll(Calendar.DAY_OF_MONTH, -1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = simpleDateFormat.format(yesterday.getTime());
        return "Ontem foi " + formattedDate;
    }

    @GetMapping("today")
    public String today() {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String formattedDate = simpleDateFormat.format(today);
        return "Hoje é " + formattedDate;
    }

    @GetMapping ("tomorrow")
    public String tomorrow() {
        GregorianCalendar tomorrow = new GregorianCalendar();
        tomorrow.roll(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = simpleDateFormat.format(tomorrow.getTime());
        return "Amanhã será " + formattedDate;
    }

}
