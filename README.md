# Negative_Point
In elliptic curve cryptography, every point  P (x,y) has a negative point −P(x ,− y mod p). The x-coordinate stays the same, while the y-coordinate is reflected across the x-axis in the finite field. This ensures the group structure needed for ECC operations.
# Negative Point in Elliptic Curve Cryptography (ECC)

Elliptic Curve Cryptography (ECC) is based on the algebraic structure of points defined on an elliptic curve over a finite field. One of the fundamental operations in ECC is **point addition**, and for this operation to form a mathematical group, each point must have an *inverse* (negative point).

## 📌 What is a Negative Point?

For any given point **P(x, y)** on an elliptic curve over a finite field with prime modulus **p**, the **negative point** is defined as:

-P = (x, (-y) mod p)

- The **x-coordinate** remains the same.  
- The **y-coordinate** is "flipped" across the x-axis in the finite field, meaning we take `p - y` (mod p).  
- Geometrically, `P` and `-P` are reflections of each other over the x-axis.

## ✅ Example

If `p = 17` and `P = (5, 7)`, then:

-P = (5, (-7) mod 17)
= (5, 10)

So, the negative point of `(5, 7)` is `(5, 10)` on the curve defined over `mod 17`.

## 🔑 Why is it Important?

- Ensures every point has an inverse, making the set of points a valid *abelian group*.  
- Essential for cryptographic operations such as:
  - **Point addition and subtraction**
  - **Elliptic Curve Diffie-Hellman (ECDH) key exchange**
  - **Elliptic Curve Digital Signature Algorithm (ECDSA)**

Without negative points, the group structure would not hold, and the cryptographic systems relying on ECC would not work properly.
