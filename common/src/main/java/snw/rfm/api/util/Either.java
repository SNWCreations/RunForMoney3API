package snw.rfm.api.util;

import com.google.common.base.Preconditions;

public final class Either<L, R> {
    public final L left;
    public final R right;

    private Either(L left, R right) {
        if (left == null) {
            Preconditions.checkArgument(right != null, "right must be non-null when left is null");
        } else {
            Preconditions.checkArgument(right == null, "right must be null when left is not null");
        }
        this.left = left;
        this.right = right;
    }

    public static <L, R> Either<L, R> left(L left) {
        return new Either<>(left, null);
    }

    public static <L, R> Either<L, R> right(R right) {
        return new Either<>(null, right);
    }
}
