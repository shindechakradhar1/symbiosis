package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import model.Recommendation;
import service.RecommendationService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/recommendations")
public class RecommendationController {
    @Autowired
    private RecommendationService recommendationService;

    @GetMapping
    public String showRecommendations(Model model) {
        List<Recommendation> recommendations = recommendationService.getAllRecommendations();
        model.addAttribute("recommendations", recommendations);
        return "recommendations";
    }

    @GetMapping("/{id}")
    public String showRecommendationDetails(@PathVariable Long id, Model model) {
        Optional<Recommendation> recommendation = recommendationService.getRecommendationById(id);
        recommendation.ifPresent(value -> model.addAttribute("recommendation", value));
        return "recommendationDetails"; 
    }

}
