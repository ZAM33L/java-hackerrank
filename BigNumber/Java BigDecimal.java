       
        Arrays.sort(s, 0, n, Collections.reverseOrder((a1, a2) -> new BigDecimal(a1).compareTo(new BigDecimal(a2))));