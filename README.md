# SimpleMavenPerfiles
SimpleMavenPerfiles

***
Proyecto para compilar un archivo WAR con maven teniendo archivos de propiedades con diferentes valores de acuerdo al ambiente a desplegar DEV, QA, UAT y PROD.

Para compilar y generar el WAR.
```
DEV
]$ mvn -Pdev clean install
> genera el WAR con pripiedades del ambiente de desarrollo.

QA 
]$ mvn -Pqa clean install
> genera el WAR con pripiedades del ambiente de qa.

UAT
]$ mvn -Puat clean install
> genera el WAR con pripiedades del ambiente de uat.

PROD
]$ mvn -Pprod clean install
> genera el WAR con pripiedades del ambiente de producccion

```

Para compilar y generar el EAR.
```
]$ mvn package
> genera el EAR con el WAR.

```