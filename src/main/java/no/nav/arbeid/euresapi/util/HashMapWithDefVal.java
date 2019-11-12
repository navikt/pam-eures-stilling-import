package no.nav.arbeid.euresapi.util;

import java.util.HashMap;

public class HashMapWithDefVal<K, V> extends HashMap<K,V> {

  private static final long serialVersionUID = 2844809384724693469L;

  private final V defaultValue;

  public HashMapWithDefVal(final V defaultValue) {
    super();
    this.defaultValue = defaultValue;
  }

  @Override
  public V get(final Object key) {
    return super.getOrDefault(key, defaultValue);
  }
}