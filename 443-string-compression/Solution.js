var compress = function(chars) {
    let index = 0;
    let i = 0;

    while (i < chars.length) {
        let currentChar = chars[i];
        let count = 0;

        while (i < chars.length && chars[i] === currentChar) {
            count++;
            i++;
        }

        chars[index++] = currentChar;

        if (count > 1) {
            for (const digit of count.toString()) {
                chars[index++] = digit;
            }
        }
    }

    chars.splice(index);

    return index;
};