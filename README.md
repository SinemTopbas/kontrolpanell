# kontrolpanell
kontrol panel uygulaması

Bu Java uygulaması, bir kullanıcı arayüzü oluşturan basit bir pencere içerir. Pencerede 4x4 bir sistemde düzenlenmiş butonlar bulunur. Her butonun üzerinde buton etiketinin yanı sıra bir GraphQL şema URL'si, aktif ve pasif renkler, aktif ve pasif simgeler bulunmaktadır.

Uygulamadaki temel amaç, kullanıcının herhangi bir butona tıklaması durumunda, tıklanan butonun aktif hale gelmesi ve diğer butonların pasif hale gelmesidir. Ayrıca, butona tıklanması durumunda konsola bir mesaj yazdırılmaktadır.

Kodun işleyiş süreci şu adımları içerir

Pencere Oluşturma:'AnaPencere' sınıfı, JFrame sınıfından türetilmiştir. Pencere başlık, kapatma işlemleri ve düzen gibi temel özellikleri belirlemektedir.

Buton Oluşturma:'butonOlustur' metodu, her bir butonun oluşturulmasını sağlar. Her butonun text değeri, kenar boşlukları ve özel özellikleri (putClientProperty kullanılarak) belirlenir. Bu özel özellikler, tıklanan butonun durumunu belirlemek için kullanılır.

Buton Tıklama İşlemi:'butonTiklandi' metodu, herhangi bir butona tıklanması durumunda gerçekleşen işlemleri yönetir. Tüm butonlar pasif hale getirilir, tıklanan buton aktif hale getirilir ve konsola bir mesaj yazdırılır.

Aktif ve Pasif Durum Ayarları:'aktifButonuAktifYap' ve 'tumButonlariPasifYap' metodları, butonların görünümünü ayarlar. Aktif butonun rengi ve simgesi belirlenen özelliklere göre ayarlanır, diğer tüm butonlar pasif duruma getirilir.

Ana Metot:'main' metodu, uygulamayı başlatan ana noktadır. SwingUtilities.invokeLater içinde bir Runnable kullanarak pencere oluşturulur.

Bu tür bir uygulama, kullanıcı arayüzü etkileşimlerini yönetebilir ve görsel geri bildirim sağlayabilir. Her ne kadar bu örnek bir GraphQL şemasının basit bir simülasyonunu gerçekleştirse de, birincil amaç genellikle kullanıcıların arayüzle etkileşime girmesine ve bu etkileşimlere yanıt vermesine olanak sağlamaktır.


GraphQL NEDİR?

  GraphQL, web geliştirmenin vazgeçilmez araçlarından biridir ve basitçe ifade etmek gerekirse, bilgisayar sistemleri arasında veri alışverişi için kullanılan bir sorgu dilidir. Geleneksel API (Application Programming Interface) yöntemlerinden farklı olarak, GraphQL istemcilere daha fazla kontrol ve esneklik sağlar. Kullanıcılar, sadece ihtiyaçları olan veriyi talep edebilir ve böylece gereksiz veri alışverişi önlenerek ağ trafiği optimize edilir. GraphQL aynı zamanda tek bir endpoint üzerinden çalışır, bu da API'nin daha düzenli ve kullanıcı dostu olmasını sağlar. Güçlü bir şema (schema) sistemi sayesinde, hangi veri türlerine ve alanlara erişilebileceği önceden belirlenir, bu da geliştiricilere rehberlik eder ve uygulama geliştirme sürecini daha anlaşılır kılar. Genel olarak, GraphQL, web uygulamalarının veri yönetimi ve iletişimini daha etkili hale getirmek için kullanılan güçlü bir araçtır.


GraphQL HANGİ AMAÇLARLA KULLANILIR?

    GraphQL, web geliştirme projelerinde çeşitli amaçlarla kullanılan bir teknolojidir.
 İlk olarak GraphQL, veri alışverişini optimize etmek ve daha verimli hale getirmek için kullanılır.
 Geleneksel RESTful API'ler müşterilere belirli bir uç nokta aracılığıyla belirli bir veri kümesi sağlarken GraphQL, müşterilere ihtiyaç duydukları verileri sorgulama ve alma esnekliği sağlar.
 Bu, gereksiz veri alımını önler, ağ trafiğini azaltır ve performansı artırır.
 Ayrıca GraphQL'in güçlü şema sistemi geliştiricilere rehberlik sağlar.
 Veri yapısını belirlerken hangi veri türlerinin, alanların ve işlemlerin kullanılabileceğini tanımlar.
 Bu, geliştirme sürecini kolaylaştırır ve uygulamanız için daha tutarlı bir yapı sağlar.
 GraphQL, birden fazla veri kaynağından bilgi almayı kolaylaştırır.
 Farklı kaynaklardan gelen veriler birleştirilerek tek sorguyla farklı bilgilere ulaşmak mümkündür.
 Bu özellik, karmaşık sistemlerde ve mikro hizmet mimarilerinde kullanıldığında önemli faydalar sağlar.
 GraphQL, gerçek zamanlı uygulamalarda da kullanılabildiği için abonelik işlevi sayesinde anlık güncellemeler ve canlı bildirimler sağlıyor.
 Bu özellik özellikle aşağıdakiler gibi dinamik ve anlık yanıtlar gerektiren Sohbet Uygulamaları ve Canlı Yayınlar için uygun yapıdadır.
 Bu nedenle GraphQL, web geliştirme projelerinde aşağıdaki gibi çeşitli amaçlarla tercih edilmektedir: 
 Esnek veri alışverişi, güçlü şema sistemi, birden fazla kaynaktan veri alma yeteneği ve gerçek zamanlı uygulama geliştirme.
 


GraphQL KULLANIM ALANLARI NELERDİR?

   GraphQL, web geliştirmenin birçok alanında yaygın olarak kullanılan bir teknoloji olarak kendini göstermektedir.
 Bu esnek ve güçlü yapı, çeşitli alanlarda etkin bir şekilde kullanılmaktadır.
 Öncelikle GraphQL web geliştirmenin temelinde yer alıyor ve web sitelerinde ve uygulamalarda sıklıkla karşımıza çıkıyor.
 GraphQL'in  esnek veri alışverişi sayesinde büyük ve karmaşık web uygulamalarını, özellikle tek sayfalı uygulamaları  daha etkin bir şekilde yönetebilirsiniz.   
 Kullanıcılara istedikleri verileri seçme özgürlüğünün verilmesi performansı artırır ve kullanıcı deneyimini geliştirir.
 GraphQL, mobil uygulama geliştirmede de  büyük  rol oynamaktadır.
 Mobil uygulamalar genellikle sınırlı kaynaklara sahiptir ve bu da verimliliği en önemli öncelik haline getirir.
 GraphQL, mobil uygulama geliştiricilerine, cihaz özelliklerine göre uyarlanmış basit veri alışverişi sağlama avantajını sunar.
 Ayrıca GraphQL, gerçek zamanlı uygulamalarda  önemli bir rol oynamaktadır.
 Sohbet uygulamaları, canlı yayın platformları ve  anlık güncelleme gerektiren diğer uygulamalar, GraphQL'in abonelik özellikleri sayesinde hızlı ve verimli bir şekilde çalışabilir.
 GraphQL, mikroservis mimarisinde çalışan büyük ölçekli sistemler için de  tercih edilebilir.
 GraphQL, farklı hizmetlerden veri almak ve bu verileri birleştirerek karmaşık sistemlerde veri alışverişini kolaylaştırmak için kullanılır.
 GraphQL geniş bir uygulama alanına sahiptir ve web geliştirme ekosisteminde önemli bir rol oynamaktadır.
 Hem web  hem de mobil uygulamaların geliştirme sürecinde daha esnek ve etkin veri alışverişinin sağlanması arzu edilmektedir.

https://github.com/1220505026/kontrolpanell/assets/127394173/0cbb2c16-b7d6-4afd-8177-ce6c6ba727f0



![görüntü1](https://github.com/1220505026/kontrolpanell/assets/127394173/074953ab-98f5-4359-840f-a0d1c642dc0f)

![görüntü2](https://github.com/1220505026/kontrolpanell/assets/127394173/7be62570-ea2c-454e-8cb8-c09a1f3a1248)

![görüntü3](https://github.com/1220505026/kontrolpanell/assets/127394173/b32b91e4-202f-4298-a57b-5423489047fd)
