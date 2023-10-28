

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        <script src="juego.js"></script>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Hunter Chroma</title>
        <style>
            body {
                font-family: Arial, sans-serif;
            }
            .color-bar {
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100px;
            }
            .color-picker {
                display: flex;
                justify-content: center;
                margin-top: 20px;
            }
            .color-box {
                width: 40px;
                height: 40px;
                margin: 0 10px;
                border: 1px solid #000000;
                cursor: pointer;
            }
            .color-container {
                width: 200px;
                height: 200px;
                margin: 20px auto;
                border: 1px solid #000000;
            }
        </style>
    </head>
    <body>
        <div class="color-bar">
            <h1>Barra de Colores</h1>
        </div>

        <div class="color-picker">
            <div class="color-box" id="red"></div>
            <div class="color-box" id="green"></div>
            <div class="color-box" id="blue"></div>
        </div>
        <div>
            <a href="listar.jsp">Puntajes</a>
       
        </div>
          
        <div class="contenedor" id = "contenedor">

            <div class="suelo"></div>

            <div class="dino dino-corriendo"></div>

            <div class="score">0</div>

        </div>
        <script>
            const redBox = document.getElementById("red");
            const greenBox = document.getElementById("green");
            const blueBox = document.getElementById("blue");
            const colorContainer = document.getElementById("contenedor");

            redBox.addEventListener("click", () => {
                colorContainer.style.backgroundColor = "red";
            });

            greenBox.addEventListener("click", () => {
                colorContainer.style.backgroundColor = "green";
            });

            blueBox.addEventListener("click", () => {
                colorContainer.style.backgroundColor = "blue";
            });
        </script>
        <div>
        <form id="formulario" style="display: none">
                <a>Nombre:</a>
                <input type="text" name="txtnombre">
                <br>
                <a>Puntaje:</a>
                <input type="text" name="txtpuntaje">
                <br>
                <input type="submit" name="accion" value="agregar"onclick="guardarPuntaje()" >
                <input type="submit" name="accion" value="reiniciar" onclick="guardarPuntaje()"><br>
        
            </form>
            </div>
        <div class="game-over">GAME OVER</div>

           
        
    </body>
</html>
