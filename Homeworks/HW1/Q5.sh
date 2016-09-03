for b in *; do mv "$b" "$(echo $b | tr [:lower:] [:upper:])"; done
