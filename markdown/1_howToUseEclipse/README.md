# **Eclipeを使おう**

## Eclipseとは
EclipseとはJavaの統合開発環境と呼ばれるもので、これひとつで、Javaプログラミング、コンパイル、実行のすべてができるツールです。さらにデバッグも自動で行ってくれるため、プログラミングの効率も向上するでしよう。

## Eclipseの使い方
では、さっそく Eclipseを使ってみましょう。

まず、Eclipseを起動すると、このようなものが出てきます。
ここは、そのままOKを押してください。

[](
  画像を修正しておく
)
![start](img/[CSSC2016]図2.1_v1.png)

<br>
すると↓の画面がでてくるので、workbenchをクリック

![welcome](img/[CSSC2016]図2.2_v1.png)

<br>
この画面が出てきます。

![workspace](img/[CSSC2016]図2.3.png)

<br>
次に、Project Explorerとかいてあるところの下の、白い枠を右クリックし、
New　→　Project を選択します。

![explorer](img/[CSSC2016]2.4.png)

<br>
Java Project を選択して、Next> をクリック

![javaProject](img/[CSSC2016]図2.4_v1.png)

<br>
Project name: のところに、今回は、HelloWorldと入力。

![newProject](img/[CSSC2016]図2.5_v1.png)

<br>
このような画面がでてきます。

![workspace](img/[CSSC2016]図2.6.png)

<br>
HelloWorldのところをダブルクリックすると、srcというフォルダが出てきます。

srcを右クリック → New → Class を選択
![newClass](img/[CSSC2016]2.6.png)

<br>
<br>
次に

1. Name: のところに、HelloWorldと入力

1. public static void main(String[] args)　のところにチェックを入れる

3. Finishをクリック

![class](img/[CSSC2016]図2.7_2_v1.png)


すると、この画面がでてきます。
![generateClass](img/[CSSC2016]図2.8.png)

ここで、ちょとしたプログラムをかいてみます。
public static void main(String[] args){ という行の下に、
```java
System.out.println("HelloWorld");
```
と追加します。

プログラムを実行するときは、左上のほうの、緑色の三角ボタンを押してください。
![run](img/[CSSC2016]図2.9_v1.png)
