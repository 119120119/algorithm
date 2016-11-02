public class QuickFind {
  private int[] id;
  public QuickFind(int capacity) {
    id = new int[capacity];
    for (int i = 0; i < capacity; i++) {
      id[i] = i;
    }
  }

  public void union(int a, int b) {
    int aid = id[a];
    for (int i = 0; i < id.length; i++) {
      if (id[i] == aid) {
        id[i] = id[b];
      }
    }
  }

  public boolean isConnected(int a, int b) {
    return id[a] == id[b];
  }
}
