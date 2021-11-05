package jah.app.dome.controllers;

import jah.app.dome.models.LinkModel;
import jah.app.dome.models.TaskModel;
import jah.app.dome.routing.RoutesUtils;
import jah.app.dome.routing.Views;
import java.util.ArrayList;
import java.util.List;
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
   * {@link List} to hold links.
   */
  final List<LinkModel> links = new ArrayList<>();

  /**
   * Create a new controller and set Model and view to a new {@link ModelAndView}.
   */
  public MainController() {

    mav = new ModelAndView();

    links.add(new LinkModel("Home", RoutesUtils.INDEX));
    links.add(new LinkModel("Tasks", RoutesUtils.TASKS));
  }

  /**
   * Route for Index Page, supplies title and page.
   *
   * @return {@link ModelAndView} with view set to index
   */
  @RequestMapping(RoutesUtils.INDEX)
  public ModelAndView index() {


    mav.setViewName(Views.INDEX.toString());
    mav.addObject("title", "DoME");
    mav.addObject("links", links);
    return mav;
  }

  /**
   * Route to tasks view and return respective tasks for the selected user.
   *
   * @return {@link ModelAndView} set to tasks.html
   */
  @RequestMapping(RoutesUtils.TASKS)
  public ModelAndView tasks() {

    final List<TaskModel> tasks = new ArrayList<>();

    mav.clear();
    mav.setViewName("Tasks");
    mav.addObject("links", links);
    mav.addObject("tasks", tasks);

    return mav;
  }

}
