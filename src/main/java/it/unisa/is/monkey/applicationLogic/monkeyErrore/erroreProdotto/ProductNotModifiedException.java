package it.unisa.is.monkey.applicationLogic.monkeyErrore.erroreProdotto;

/**
 * Eccezione errore nella modifica del prodotto.
 */
public class ProductNotModifiedException extends Exception {

  private static String MESSAGGIO_DEFAULT = "errore nella modifica del prodotto";

  public ProductNotModifiedException() {
    super(MESSAGGIO_DEFAULT);
  }

  public ProductNotModifiedException(String messaggio) {
    super(messaggio);
  }
}
