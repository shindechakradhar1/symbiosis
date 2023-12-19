package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import model.Destination;
import service.DestinationService;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/destinations")
public class DestinationController {
    @Autowired
    private DestinationService destinationService;

    @GetMapping
    public String showDestinations(Model model) {
        List<Destination> destinations = destinationService.getAllDestinations();
        model.addAttribute("destinations", destinations);
        return "destinations";
    }

    @GetMapping("/{id}")
    public String showDestinationDetails(@PathVariable Long id, Model model) {
        Optional<Destination> destination = destinationService.getDestinationById(id);
        destination.ifPresent(value -> model.addAttribute("destination", value));
        return "destinationDetails";
    }

}

