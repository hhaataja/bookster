$ ->
 $.get "/books", (data) ->
 	$.each data, (index, book)  ->
 		$("#books").append $("<li>").text book.name