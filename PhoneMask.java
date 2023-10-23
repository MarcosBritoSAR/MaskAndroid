ptTelefone2.addTextChangedListener(new TextWatcher() {

//ptTelefone2 é o objeto da minha classe editText

            boolean mask1 = false;
            boolean mask2 = false;
            boolean mask3 = false;
            boolean add = false;
            boolean rv = false;
            int tamanho = 0;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //---------Setando o estado da minha operação. Se é de excluir ou de adicionar
                if (i1 == 1) {
                    add = false;
                    rv = true;

                } else if (i2 == 1) {
                    add = true;
                    rv = false;
                }

                if (i1 == 1) {

                    if (charSequence.charAt(i) == '(') {
                        mask1 = false;
                    }
                    if (charSequence.charAt(i) == ')') {
                        mask2 = false;
                    }
                    if (charSequence.charAt(i) == '-') {
                        mask3 = false;
                    }
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (i2 == 1) {

                    if (charSequence.charAt(i) == '(') {
                        mask1 = true;
                    }
                    if (charSequence.charAt(i) == ')') {
                        mask2 = true;
                    }
                    if (charSequence.charAt(i) == '-') {
                        mask3 = true;
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

                tamanho = editable.toString().length();

                if (add == true && tamanho == 1 && mask1 == false) {
                    ptTelefone2.setText("(" + editable.toString());
                    ptTelefone2.setSelection(tamanho);
                }

                if(add == true && tamanho == 3 && mask2 == false){
                    ptTelefone2.setText( editable.toString()+") 9");
                    ptTelefone2.setSelection(tamanho);
                }

                if(add == true && tamanho == 10 && mask3 == false){
                    ptTelefone2.setText( editable.toString()+"-");
                    ptTelefone2.setSelection(tamanho);
                }

            }
        });
        //-----------END
