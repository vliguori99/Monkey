package it.unisa.is.monkey.applicationLogic.monkeyErrore.erroreProdotto;

/**
 * Eccezione errore nella creazione del prodotto.
 */

public class ProductNotCreatedException extends Exception {

  private static String MESSAGGIO_DEFAULT = "errore nella creazione del prodotto";

  public ProductNotCreatedException() {
    super(MESSAGGIO_DEFAULT);
  }

  public ProductNotCreatedException(String messaggio) {
    super(messaggio);
  }
}
