package Tienda;

public class StockInsuficienteException extends RuntimeException {
  public StockInsuficienteException(String message) {
    super(message);
  }
}
