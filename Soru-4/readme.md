## Mikroservice mimarisi ve monolith mimariyi karşılaştıran bir yazı yazın.

Monolith Mimari’ de program tek bir bütün halinde hareket eder. Ve programda bir şeyi değiştirmek için uygulamanın tamamında değişiklik yapmak gerekebilir. Yani program içi bağımlılık yüksektir.  Genelde büyük projelerden ziyade daha az işlevselliğin olduğu küçük projelerde kullanılabilir. 
Mikroservice mimarisinde ise projede bir işi yapan uygulamalar ayrı ayrı küçük parçalar olarak tasarlanır ve sonrasında istenilirse başka projelerde de kullanılabilir.  Ve bu sayede projede ki bağımlılık azaltılmış olur.
İki mimarininde kendine göre avantajları ve dezavantajları vardır.


### Monolith mimari 

- Geliştirilmesi kolaydır.
- Kolay bir şekilde çalıştırılabilir. 
- Test işlemleri daha kolaydır.
- Karmaşıktır. Özellikle proje büyüdükçe. 
- Herhangi bir değişiklik yapmak için nerdeyse tüm projeyi elden geçirmek gerekir.


### Microservice Mimarisi

- İşler ayrı ayrı ve daha küçük parçalara ayrıldığı için neyin ne işi yapacağı bellidir.
- Yeni şeyler eklemek daha basittir.
- Farklı farklı proje ve uygulamalarda kullanılabilir.  
- Herhangi hata durumunda sadece ilgili servis etkilenir, tüm proje değil.
- Monolith mimariden daha karmaşıktır. Her bir servis ayrı ayrı yapılandırılması gereklidir.
