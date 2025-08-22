# Projedata Iniflex

---

Foi divertido!


## TESTE PRÁTICO PROGRAMAÇÃO.

Considerando que uma indústria possui as pessoas/funcionários abaixo:

Diante disso, você deve desenvolver um projeto java, com os seguintes requisitos:

1– Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).

2 – Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).

3 – Deve conter uma classe Principal para executar as seguintes ações:<br>
3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.<br>
3.2 – Remover o funcionário “João” da lista.<br>
3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:<br>
• informação de data deve ser exibido no formato dd/mm/aaaa;<br>
• informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.<br>
3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.<br>
3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.<br>
3.6 – Imprimir os funcionários, agrupados por função.<br>
3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.<br>
3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.<br>
3.10 – Imprimir a lista de funcionários por ordem alfabética.<br>
3.11 – Imprimir o total dos salários dos funcionários.<br>
3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.<br>



---

## Passo a passo para executar o programa

* Download do testeiniflex-1.0-SNAPSHOT.jar que está na pasta Target
* Abrir o prompt de comando e navegar até a pasta onde o arquivo foi salvo
* Executar o comando java -jar testeiniflex-1.0-SNAPSHOT.jar

```
C:\local\: java -jar testeiniflex-1.0-SNAPSHOT.jar
```

---

## Resultado da aplicação
```

--------------------------------------------------------------

                    Lista de funcionários

--------------------------------------------------------------
| Nome       | Nascimento      | Salario    | Funcao        |
--------------------------------------------------------------
| Maria      | 18/10/2000      | 2.009,44   | Operador      |
| Caio       | 02/05/1961      | 9.836,14   | Coordenador   |
| Miguel     | 14/10/1988      | 19.119,88  | Diretor       |
| Alice      | 05/01/1995      | 2.234,68   | Recepcionista |
| Heitor     | 19/11/1999      | 1.582,72   | Operador      |
| Arthur     | 31/03/1993      | 4.071,84   | Contador      |
| Laura      | 08/07/1994      | 3.017,45   | Gerente       |
| Heloísa    | 24/05/2003      | 1.606,85   | Eletricista   |
| Helena     | 02/09/1996      | 2.799,93   | Gerente       |

--------------------------------------------------------------
               Lista de funcionários por função
--------------------------------------------------------------
Operador:
| Maria      | 18/10/2000      | 2.210,38   | Operador      |
| Heitor     | 19/11/1999      | 1.740,99   | Operador      |

Eletricista:
| Heloísa    | 24/05/2003      | 1.767,54   | Eletricista   |

Recepcionista:
| Alice      | 05/01/1995      | 2.458,15   | Recepcionista |

Diretor:
| Miguel     | 14/10/1988      | 21.031,87  | Diretor       |

Gerente:
| Laura      | 08/07/1994      | 3.319,20   | Gerente       |
| Helena     | 02/09/1996      | 3.079,92   | Gerente       |

Coordenador:
| Caio       | 02/05/1961      | 10.819,75  | Coordenador   |

Contador:
| Arthur     | 31/03/1993      | 4.479,02   | Contador      |

--------------------------------------------------------------
          Funcionários aniversariantes mês 10 e 12
--------------------------------------------------------------
| Maria      | 18/10/2000      | 2.210,38   | Operador      |
| Miguel     | 14/10/1988      | 21.031,87  | Diretor       |

--------------------------------------------------------------
                    Funcionários mais velho
--------------------------------------------------------------
                     Caio 02/05/1961

--------------------------------------------------------------
            Funcionários ordenados alfabeticamente
--------------------------------------------------------------
| Alice      | 05/01/1995      | 2.458,15   | Recepcionista |
| Arthur     | 31/03/1993      | 4.479,02   | Contador      |
| Caio       | 02/05/1961      | 10.819,75  | Coordenador   |
| Heitor     | 19/11/1999      | 1.740,99   | Operador      |
| Helena     | 02/09/1996      | 3.079,92   | Gerente       |
| Heloísa    | 24/05/2003      | 1.767,54   | Eletricista   |
| Laura      | 08/07/1994      | 3.319,20   | Gerente       |
| Maria      | 18/10/2000      | 2.210,38   | Operador      |
| Miguel     | 14/10/1988      | 21.031,87  | Diretor       |

--------------------------------------------------------------
            Total dos salários funcionários
--------------------------------------------------------------
                       R$ 50.906,82

--------------------------------------------------------------
            Salários mínimos por funcionário (R$1.212,00)
--------------------------------------------------------------
| Maria      | R$2.210,38   | 1          |
| Caio       | R$10.819,75  | 8          |
| Miguel     | R$21.031,87  | 17         |
| Alice      | R$2.458,15   | 2          |
| Heitor     | R$1.740,99   | 1          |
| Arthur     | R$4.479,02   | 3          |
| Laura      | R$3.319,20   | 2          |
| Heloísa    | R$1.767,54   | 1          |
| Helena     | R$3.079,92   | 2          |
