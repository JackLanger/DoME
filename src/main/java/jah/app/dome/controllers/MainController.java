package jah.app.dome.controllers;

import jah.app.dome.routing.RoutesUtil;
import jah.app.dome.routing.Views;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Main Controller for the application.
 */
@Controller
public class MainController {

  /**
   * {@link ModelAndView}.
   */

  private final transient ModelAndView mav;

  /**
   * Create a new controller and set Model and view to a new {@link ModelAndView}.
   */
  public MainController() {

    mav = new ModelAndView();
  }

  /**
   * Route for Index Page, supplies title and page.
   *
   * @return {@link ModelAndView} with view set to index
   */
  @RequestMapping(RoutesUtil.INDEX)
  public ModelAndView index() {

    mav.setViewName(Views.INDEX.toString());
    mav.addObject("title", "DoME");
    return mav;
  }

}
