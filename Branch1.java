class Branch1 {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.10;  // 消費税率10%
    int discount, amount;

    if (price >= 3000) {  // 割引額の設定
      discount = 300;
    } else {
      discount = 0;
    }

    amount = (int)((price - discount) * (1 + rate));
    System.out.println("値引金額：" + discount + "円");
    System.out.println("税込金額：" + amount + "円");
  }
}