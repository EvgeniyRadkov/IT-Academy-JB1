package com.gmail.radzkovevgeni.model;

public class RepairData {
    String kod;
    String nomerRasporiazeniya;
    String zakazchik;
    String innZakazchika;
    String podriadchik;
    String innPodriadchika;
    String rayon;
    String adres;
    String vidOgranicheniya;
    String vidRabot;
    String dataNachalaOgranicheniya;
    String dataOkonchaniyaOgranicheniya;
    String dataSniatiyaOgrenicheniya;
    String utochnenieSrokov;

    public static class Builder {

        private  RepairData newColumn;

        public Builder() {
            newColumn = new RepairData();
        }

        public Builder kod(String kod) {
            this.newColumn.kod = kod;
            return this;
        }

        public Builder nomerRasporiazeniya(String nomerRasporiazeniya) {
            this.newColumn.nomerRasporiazeniya = nomerRasporiazeniya;
            return this;
        }

        public Builder zakazchik(String zakazchik) {
            this.newColumn.zakazchik = zakazchik;
            return this;
        }

        public Builder innZakazchika(String innZakazchika) {
            this.newColumn.innZakazchika = innZakazchika;
            return this;
        }

        public Builder podriadchik(String podriadchik) {
            this.newColumn.podriadchik = podriadchik;
            return this;
        }

        public Builder innPodriadchika(String innPodriadchika) {
            this.newColumn.innPodriadchika = innPodriadchika;
            return this;
        }

        public Builder rayon(String rayon) {
            this.newColumn.rayon = rayon;
            return this;
        }

        public Builder adres(String adres) {
            this.newColumn.adres = adres;
            return this;
        }

        public Builder vidOgranicheniya(String vidOgranicheniya) {
            this.newColumn.vidOgranicheniya = vidOgranicheniya;
            return this;
        }

        public Builder vidRabot(String vidRabot) {
            this.newColumn.vidRabot = vidRabot;
            return this;
        }

        public Builder dataNachalaOgranicheniya(String dataNachalaOgranicheniya) {
            this.newColumn.dataNachalaOgranicheniya = dataNachalaOgranicheniya;
            return this;
        }

        public Builder dataOkonchaniyaOgranicheniya(String dataOkonchaniyaOgranicheniya) {
            this.newColumn.dataOkonchaniyaOgranicheniya = dataOkonchaniyaOgranicheniya;
            return this;
        }

        public Builder dataSniatiyaOgrenicheniya(String dataSniatiyaOgrenicheniya) {
            this.newColumn.dataSniatiyaOgrenicheniya = dataSniatiyaOgrenicheniya;
            return this;
        }

        public Builder utochnenieSrokov(String utochnenieSrokov){
            this.newColumn.utochnenieSrokov = utochnenieSrokov;
            return this;
        }

        public RepairData build() {
            return this.newColumn;
        }

    }

    public String getKod() {
        return kod;
    }

    public String getNomerRasporiazeniya() {
        return nomerRasporiazeniya;
    }

    public String getZakazchik() {
        return zakazchik;
    }

    public String getInnZakazchika() {
        return innZakazchika;
    }

    public String getPodriadchik() {
        return podriadchik;
    }

    public String getInnPodriadchika() {
        return innPodriadchika;
    }

    public String getRayon() {
        return rayon;
    }

    public String getAdres() {
        return adres;
    }

    public String getVidOgranicheniya() {
        return vidOgranicheniya;
    }

    public String getVidRabot() {
        return vidRabot;
    }

    public String getDataNachalaOgranicheniya() {
        return dataNachalaOgranicheniya;
    }

    public String getDataOkonchaniyaOgranicheniya() {
        return dataOkonchaniyaOgranicheniya;
    }

    public String getDataSniatiyaOgrenicheniya() {
        return dataSniatiyaOgrenicheniya;
    }

    public String getUtochnenieSrokov() {
        return utochnenieSrokov;
    }

}
