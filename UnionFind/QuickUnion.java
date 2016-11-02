class QuickUnion {
  private int[] id;
  public QuickUnion(int capacity) {
    id = new int[capacity];
    for (int i = 0; i < capacity; i++) {
      id[i] = i;
    }
  }

  private int root(int a) {
    while(id[a] != a) {
      a = id[a];
    }
    return a;
  }

  public void union(int a, int b) {
    id[root(a)] = id[root(b)];
  }

  public boolean connected(int a, int b) {
    return root(a) == root(b);
  }
}
