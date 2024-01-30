<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1><hr>
<h3>Товары со всей России</h3>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
    </#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название объявлиния: <input type="text" name="title"><br><br>
    Описание объявлиния: <input type="text" name="title"><br><br>
    Цена: <input type="number" name="price"><br><br>
    Город: <input type="text" name="city"><br><br>
    Автор: <input type="text" name="author"><br><br>
    Аниме: <input type="text" name="anime"><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>