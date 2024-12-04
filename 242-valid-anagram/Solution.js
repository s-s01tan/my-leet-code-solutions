/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
    const letterObj = {};

    for (const letter of s) {
        if (letterObj[letter]) {
            letterObj[letter] += 1;
        } else {
            letterObj[letter] = 1;
        }
    }

    for (const letter of t) {
        if (letterObj[letter] >= 1) {
            letterObj[letter] -= 1;
        } else {
            return false;
        }
    }

    const values = Object.values(letterObj);

    for (const value of values) {
        if (value === 0) {
            continue;
        } else {
            return false;
        }
    }

    return true;
};