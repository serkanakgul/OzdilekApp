Specification Heading
=====================

This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

To execute this specification, run
	gauge specs

OzdilekAppium
-------------
*Alisverise basla butonuna tıklanır
*"2" saniye bekle
*"com.ozdilek.ozdilekteyim:id/nav_categories" İd'li elemente tıkla
*Kadın secenegine tiklanir
*Pantolona tikla
* "2" saniye bekle
*sayfa boyunca scroll et
* "2" saniye bekle
*sayfa boyunca scroll et
* "1" saniye bekle
* "//android.widget.ImageView[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']" xpath'te bulunan sayfada görünen tüm ürünleri bul ve rastgele bir ürüne tıkla
* "3" saniye bekle
*"com.ozdilek.ozdilekteyim:id/imgFav" İd'li elemente tıkla
*"2" saniye bekle
*"com.ozdilek.ozdilekteyim:id/etEposta" İd'li elemente "text" değerini yaz
*"1" saniye bekle
*"com.ozdilek.ozdilekteyim:id/etPassword" İd'li elemente "sifre" değerini yaz
*"2" saniye bekle
*"com.ozdilek.ozdilekteyim:id/ivBack" İd'li elemente tıkla
*"1" saniye bekle
*"com.ozdilek.ozdilekteyim:id/ivBack" İd'li elemente tıkla
*"3" saniye bekle
*"//android.widget.ImageView[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']" xpath'te bulunan sayfada görünen tüm ürünleri bul ve rastgele bir ürüne tıkla
*"2" saniye bekle
*"com.ozdilek.ozdilekteyim:id/ivAddCart" İd'li elemente tıkla
*"4" saniye bekle


