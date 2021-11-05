package jah.app.dome.dal.connectors;

import jah.app.dome.dal.DataBaseConnector;
import jah.app.dome.models.TaskModel;
import java.util.List;

public class TaskDatabaseConnector implements DataBaseConnector<TaskModel> {

  @Override
  public boolean writeData(final List<TaskModel> data) {

    return false;
  }

  @Override
  public boolean deleteEntity(final TaskModel entity) {

    return false;
  }

  @Override
  public List<TaskModel> getEntities() {

    return null;
  }

  @Override
  public List<TaskModel> getEntities(final int amount) {

    return null;
  }

  @Override
  public List<TaskModel> getEntities(final String filter) {

    return null;
  }

  @Override
  public boolean update() {

    return false;
  }

}
