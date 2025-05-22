class interpAvalia {

    float avalia(ArvoreSintatica arv) {
        return (avalia2(arv));
    }

    float avalia2(ArvoreSintatica arv) {

        if (arv instanceof Mult)
            return (avalia2(((Mult) arv).arg1) *
                    avalia2(((Mult) arv).arg2));

        if (arv instanceof Soma)
            return (avalia2(((Soma) arv).arg1) +
                    avalia2(((Soma) arv).arg2));
        if (arv instanceof Sub)
            return (avalia2(((Sub) arv).arg1) -
                    avalia2(((Sub) arv).arg2));
        if (arv instanceof Div)
            return (avalia2(((Div) arv).arg1) /
                    avalia2(((Div) arv).arg2));
        if (arv instanceof Num)
            return (((Num) arv).num);

        return 0;
    }
}
