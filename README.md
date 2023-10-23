# Mask Android ✅


---

### #Explicando os métodos

dentro do **objeto** `editText` existe o `addTextChangedListener()` que recebe`new TextWatcher(){}` como parâmetro. 

 - A `TextWatcher(){}` é uma classe abstrata. Quando invocada pede 3 métodos para implementação, sendo eles:
> 
1. `void beforeTextChanged(CharSequence var1, int var2, int var3, int var4);`
2. `void onTextChanged(CharSequence var1, int var2, int var3, int var4);`
3. `void afterTextChanged(Editable var1);`
> 
 ---
 
 O primeiro método é acionando com os argumentos do editText antes de qualquer modificação. Por exemplo: se é setado 8 para iniciar um numero de telefone, o `beforeTextChanged` será acionado para verificar o estado anterior da editText. Ou seja, como a editText se encontrava no momento em que o valor 8 foi setado;
> 
 O segundo método é acionado com os argumentos do edtiText no estado atual da modificação. Por exemplo: se é setado 8 para iniciar um número de telefone, o `onTextChanged` será acionada pra verificar o estado atual da editText. Ou seja, como a editText se encontra no momento atual em que o valor 8 é setado;
> 
 O terceiro método é adicionado com os argumentos do editText no estado posterior da modificação. Por exemplo: se é setado 8 para iniciar um número de telefone, o `afterTextChanged` será acionado para verificar o estado posterior da editText. Ou seja, como a editText se encontrará no momento conseguinte em que o valor 8 será setado;
> 

### #Explicando os parâmetros dos métodos

 `public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)`
`CharSequence charSequence` == É o texto anterior dentro do editText
`int i` == É o tamanho anterior do texto dentro do editText
`int i1` == Avisa se estou removendo valores. 1 == removendo. 0 == nada acontecendo
`int i2` == Avisa se estou adicionando valores. 2 == adicionando. 0== nada acontecendo
> 

 `public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)`
`CharSequence charSequence` == É o texto atual dentro do editText
`int i` == É o tamanho anterior do texto dentro do editText
`int i1` == Avisa se estou removendo valores. 1 == removendo. 0 == nada acontecendo
`int i2` == Avisa se estou adicionando valores. 2 == adicionando. 0== nada acontecendo
> 

 `public void afterTextChanged(Editable editable)`
`Editable editable` = =Permite que seja trabalhado de varias formas o texto dentro do editText
> 

### #Explicando os atributos

- `boolean mask1 = false;` = Informa se o componente “(” foi adicionando. true == adicionando, false == não adicionado
- `boolean mask2 = false;` = Informa se o componente “)” foi adicionando. true == adicionando, false == não adicionado
- `boolean mask3 = false;` = Informa se o componente “-” foi adicionando. true == adicionando, false == não adicionado
- `boolean add = false;` = Informa se esta sendo adicionado um valor ao editText
- `boolean rv = false;` = Informa se esta sendo removido um valor ao editText
- `int tamanho = 0;` = Informa o tamanho dos valores dentro do editText

---

//————————————RODAPÉ————————————————-

<aside>
👺 Em caso de critica ao código ou eventuais observações, favor entrar em contato com marcosbryto92@gmail.com;

Ou realize o Fork e submeta que irei revisar;

</aside>
