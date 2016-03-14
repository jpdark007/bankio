# bankio
##  A Java library to manage file format for banking interchange such as CFBON120, CFONB160, SEPA  iso/20022 ... 
 [![Build Status](https://travis-ci.org/jpdark007/bankio.svg?branch=master)](https://travis-ci.org/jpdark007/bankio)
[![codecov.io](https://codecov.io/github/jpdark007/bankio/coverage.svg?branch=master)](https://codecov.io/github/jpdark007/bankio?branch=master)
 ![License](https://img.shields.io/hexpm/l/plug.svg)


# Introduction
[CFONB](http://fr.wikipedia.org/wiki/CFONB) are French legacy files formats for banking interchange, made by the CFONB (Comité français d'organisation et de normalisation bancaires). The specifications of CFONB files can be found on the [CFONB website](http://www.cfonb.org).

Today France is supporting one single domestic credit transfer: the "Virement", which is supported by the format CFONB160 (fixed file of 160 characters).

In addition to using a new format, migrating to [SEPA](https://en.wikipedia.org/wiki/Single_Euro_Payments_Area) needs some tools. Bankio is here to help you is this way.

# Format supported
 - CFONB120 (almost done)
 - CFONB160 (in progress)
 - Customer Credit Transfer pain.001.001 (in study)
 - Bank To Customer Debit Credit Notification camt.054.001 (in study)
 - Customer Direct Debit Initiation pain.008.001  (in study)
 
## Usage
## CFONB120 Reader
```java
BeanCfonb120 b = BeanReaderCfonb.getBeanCfonb120FromFile(new File("myPath"));
```
## CFONB120 writer
```java
BeanReaderCfonb myBean ....
BeanWriterCfonb.setBeanCfonb120ToFile(myBean);
```