package jah.app.dome.dal;

import jah.app.dome.models.Model;

public interface ConnectorFactory {

  public <T extends Model> DataBaseConnector<T> getConnector();

}
