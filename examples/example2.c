struct a {
  int a;
  int b;
};

int main() {
  struct a a;
  a.a = 1;
  while(a.b) {
    a.b = 0;
    if(a.a != 1)
        return 1;
  }
  return a.a + a.b;
}
