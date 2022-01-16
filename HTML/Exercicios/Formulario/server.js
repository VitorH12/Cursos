//Backend, recebimento de dados

const express = require("express") //importando o express
const app = express() //instanciando o express e associando na variável app
const bodyParser = require("body-parser") //importando o body parser
//uma vez que é submetido dados do formulário vai ser feito um parser 
//no corpo da inquisição e vai jogar os dados no request.body

//urlencoded é o padrão pra submeter um formulário, então tem que ter o o parser no urlencoded
app.use(bodyParser.urlencoded({extends: true})) 

//para atender as urls
//<form action="http://localhost:3003/usuarios" method="POST">
app.post("/usuarios", (req, resp) => { //requisão e resposta
    console.log(req.body) //para saber o que chegou
    resp.send("<h1> Parabéns. Usuário Incluido </h1>") //resposta
    
})

app.post("/usuarios/:id", (req, resp) => {
    console.log(req.params.id)
    console.log(req.body) 
    resp.send("<h1> Parabéns. Usuário Alterado </h1>") 
    
})
app.listen(3003)