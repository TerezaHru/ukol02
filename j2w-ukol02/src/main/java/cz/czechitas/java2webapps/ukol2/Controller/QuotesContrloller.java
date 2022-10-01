package cz.czechitas.java2webapps.ukol2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;


@Controller

public class QuotesContrloller {
    private final Random random = new Random();
    @GetMapping ("/")
    public ModelAndView quotes() {
        int hozeneCislo = random.nextInt(10) + 1;
        ModelAndView result = new ModelAndView("quotes");

        ArrayList<String> sentences = new ArrayList<>();
        sentences.add("Když jde člověk stále rovně, daleko nedojde.");
        sentences.add("Všichni dospělí byli dětmi, ale málokdo si na to pamatuje.");
        sentences.add("Jedině děti vědí, co hledají.");
        sentences.add("Nikdy nejsme spokojeni tam, kde jsme.");
        sentences.add("Správně vidíme jen srdcem.");
        sentences.add("Co je důležité, je očím neviditelné.");
        sentences.add("Chceš-li porozumět lidem, přestaň poslouchat, co říkají.");
        sentences.add("Když jde člověk stále rovně, daleko nedojde.");
        sentences.add("Vše, co je v člověku krásné, je očima neviditelné.");
        sentences.add("Jedině děti vědí, co hledají.");
        result.addObject("text", (sentences.get(hozeneCislo-1)));
        result.addObject("cislo", hozeneCislo);
        result.addObject("obrazek", String.format("images/foto-%d.jpg", hozeneCislo));
        return result;
    }
}
