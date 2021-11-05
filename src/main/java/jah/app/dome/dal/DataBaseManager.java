package jah.app.dome.dal;

import jah.app.dome.models.Model;

/**
 * {@link DataBaseManager} Manager class to create database connectors.
 */
public abstract class DataBaseManager implements ConnectorFactory {


  /**
   * gets instance of a parameterized {@link DataBaseConnector}.
   * TODO: implement
   *
   * @param clazz Class that is derived from {@link Model}
   * @return a {@link DataBaseConnector}
   */
  public abstract <ModelT extends Model> DataBaseConnector<ModelT> getInstance(final Class<ModelT> clazz);


  /**
   * The name of the Table to be read.
   */
  protected String tableName;

  /**
   * Protected constructor
   */
  protected DataBaseManager() {
    //empty constructor
    //TODO: set tableName according to the ModelT that is beeing used

  }

}
